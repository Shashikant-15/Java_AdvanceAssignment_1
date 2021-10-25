package Adv_9.p;


        import Adv_9.p1.TwoDim;
        import Adv_9.p2.ThreeDim;


class Main {
    public static void main(String[] args) {
        TwoDim ref;
        ref = new TwoDim(3, 4);
        System.out.println(ref);
        ref = new ThreeDim(7, 9, 11);
        System.out.println(ref);
    }
}
