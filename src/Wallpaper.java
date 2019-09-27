public class Wallpaper {
    public static void main(String[] args) {
        double width = 5;
        double length = 6;
        double height = 2.85;
        double perimeter = (width + length) * 2;
        double wallpaperWidth = 1.06;
        int wallpaperSheet = (int) (perimeter / wallpaperWidth) + 1;
        int coilLength = 10;
        int sheetsFromCoil = (int) (coilLength / height);
        int coilQuantity = wallpaperSheet / sheetsFromCoil;
        System.out.println(coilQuantity);
    }


}

