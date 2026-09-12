package Arrays1;

class Main {

    public static void trapwater(int height[]) {

        int leftmax[] = new int[height.length];
        int rightmax[] = new int[height.length];

        int water = 0;

        leftmax[0] = height[0];
        rightmax[height.length - 1] = height[height.length - 1];

        // Left maximum
        for (int i = 1; i < height.length; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }

        // Right maximum
        for (int i = height.length - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        // Calculate trapped water
        for (int i = 0; i < height.length; i++) {

            int v = Math.min(leftmax[i], rightmax[i]);

            water += v - height[i];
        }

        System.out.println(water);
    }

    public static void main(String[] args) {

        int height[] = {4, 2, 0, 6, 3, 2, 5};

        trapwater(height);
    }
}