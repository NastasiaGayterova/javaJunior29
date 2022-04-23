package LessonHM;

public class Main1 {
    public static void main(String[] args) {
        double[][] nums1 = {{2, 1, 5, 4},
                            {1, 3, 6, 3},
                            {5, 6, 4, 1}};
        Matrix matrix1 = new Matrix(nums1);
        System.out.println(matrix1.getRows());
        System.out.println(matrix1.getColumns());
        System.out.println(matrix1.getValueAt(0,90));


        double[][] nums2 = {{2, 1, 5, 4},
                            {1, 3, 6, 3},
                            {5, 6, 4, 1}};
        Matrix matrix2 = new Matrix(nums2);
        IMatrix resultAdd = matrix1.add(matrix2);
    }
}
