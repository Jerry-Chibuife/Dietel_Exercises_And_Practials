package Chapter7.Exercise;

public class WriteJavaStatements {
    public static void main(String[] args) {

        //a
        int[] r;
        r = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(r[9]);

        //b
        int[] g;
        g = new int[10];
        for (int a = 0; a < g.length; a++)
            g[a] = -1;
        System.out.println(g[6]);

        //c
        double[] c = new double[100];
        double maximum = c[0];
        for (int b = 0; b < c.length; b++) {
            c[b] = b + 2;
            if (c[b] > maximum) maximum = c[b];
        }
        System.out.println(maximum);

        //d
        int[] a = new int[100];
        int[] b = new int[100];
        int t = 0;
        for(int i = 0; i < a.length; i++)
            a[i] = i + 1;
        for(int z = 0; z < b.length; z++) {
                b[z] = a[b.length - t - 1];
                t++;
        }
        System.out.println(b[0]);

        //e
        int[] w = new int[100];
        int product = 1;
        for(int j = 0; j < w.length; j++)
            w[j] = j + 1;
        for (int k = 3; k < 11; k++)
            product *= w[k];
        System.out.println(product);
    }
}
