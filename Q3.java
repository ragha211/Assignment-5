//الشفرة المعروضة تقوم بإنشاء ثلاث قوائم مزدوجة الاتجاه وتقارن بينها باستخدام الأسلوب `equals()` في الفئة `doulayLinkedList`
// . يتم طباعة النتائج التي تظهر ما إذا كانت القوائم متساوية أم لا.
public class Q3 {
    public static void main(String[] args) {
        doulayLinkedList<Integer> L = new doulayLinkedList<>(); // إنشاء قائمة مزدوجة الاتجاه L
        doulayLinkedList<Integer> M = new doulayLinkedList<>(); // إنشاء قائمة مزدوجة الاتجاه M
        doulayLinkedList<Integer> K = new doulayLinkedList<>(); // إنشاء قائمة مزدوجة الاتجاه K

        L.addFirst(11); // إضافة عنصر 11 في بداية القائمة L
        L.addlast(12); // إضافة عنصر 12 في نهاية القائمة L

        M.addFirst(16); // إضافة عنصر 16 في بداية القائمة M
        M.addlast(11); // إضافة عنصر 11 في نهاية القائمة M

        K.addFirst(11); // إضافة عنصر 11 في بداية القائمة K
        K.addlast(12); // إضافة عنصر 12 في نهاية القائمة K

        // قارن قائمة M وقائمة L باستخدام الأسلوب equals()
        if (L.equals(L, M))
            System.out.println("list M and list L equals");
        else
            System.out.println("list M and list L not equals");

        // قارن قائمة K وقائمة L باستخدام الأسلوب equals()
        if (K.equals(L, K))
            System.out.println("list K and list L equals");
        else
            System.out.println("list K and list L not equals");
    }
}