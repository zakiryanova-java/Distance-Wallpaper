public class Task02 {
    public static void main(String[] args) {
        int width = 5;
        int length = 6;
        double height = 2.85;
        int perimeter = (width + length) * 2;
        double wallpaperWidth = 1.06;
        double wallpaperSheet = perimeter / wallpaperWidth;
        int coilLength = 10;
        double sheetsFromCoil = coilLength / height;
        int coilQuantity = ((int) wallpaperSheet + 1) / (int) sheetsFromCoil;
        System.out.println(coilQuantity);
    }


}

