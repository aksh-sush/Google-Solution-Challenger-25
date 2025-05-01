package SevenZip;

public abstract class ClassWriter
{
  private static ClassWriter index;
  
  public ClassWriter() {}
  
  public static ClassWriter newUTF8()
  {
    if (index == null) {
      index = new FixedClassWriter();
    }
    return index;
  }
}
