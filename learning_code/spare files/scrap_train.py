import requests
from bs4 import BeautifulSoup

url = "http://shivkumar.org/music/basics/"
response = requests.get(url)
soup = BeautifulSoup(response.text, 'html.parser')

mp3_links = []
for a in soup.find_all('a', href=True):
    if a['href'].endswith('.mp3'):
        link = a['href']
        if not link.startswith("http"):
            link = url + link
        mp3_links.append(link)

for mp3_url in mp3_links:
    filename = mp3_url.split("/")[-1]
    print(f"Downloading {filename} from {mp3_url}")
    try:
        res = requests.get(mp3_url)
        res.raise_for_status()
        with open(filename, 'wb') as f:
            f.write(res.content)
        print(f"✅ Downloaded: {filename}")
    except Exception as e:
        print(f"❌ Failed: {filename} — {e}")
