public class Wallpaper {
    public static void main(String[] args) {
        int width = 5;
        int length = 6;
        double height = 2.85;
        int perimeter = (width + length) * 2;
        double wallpaperWidth = 1.06;
        int wallpaperSheet = (int) (perimeter / wallpaperWidth) + 1;
        int coilLength = 10;
        int sheetsFromCoil = (int) (coilLength / height);
        int coilQuantity = wallpaperSheet / sheetsFromCoil;
        System.out.println(coilQuantity);
    }


}

