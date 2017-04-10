public class Cuboid {
  private int x;
  private int y;
  private int z;

  public Cuboid(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public int getSurface() {
    return x * y * 2 + x * z * 2 + y * z * 2;
  }

  public int getVolume() {
    return x * y * z;
  }
}