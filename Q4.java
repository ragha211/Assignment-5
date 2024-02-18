public class Q4 {
    public static void main(String[] args) {
        doulayLinkedList<Integer> L = new doulayLinkedList<>(); // إنشاء قائمة مزدوجة الاتجاه L
        doulayLinkedList<Integer> M = new doulayLinkedList<>(); // إنشاء قائمة مزدوجة الاتجاه M

        L.addFirst(11); // إضافة عنصر 11 في بداية القائمة L
        L.addlast(12); // إضافة عنصر 12 في نهاية القائمة L
        L.addlast(13); // إضافة عنصر 13 في نهاية القائمة L
        L.addlast(14); // إضافة عنصر 14 في نهاية القائمة L
        L.addlast(15); // إضافة عنصر 15 في نهاية القائمة L

        System.out.print("list1: ");
        L.print(); // طباعة قائمة L باستخدام الأسلوب print()

        M.addFirst(16); // إضافة عنصر 16 في بداية القائمة M
        M.addlast(17); // إضافة عنصر 17 في نهاية القائمة M
        M.addlast(18); // إضافة عنصر 18 في نهاية القائمة M
        M.addlast(19); // إضافة عنصر 19 في نهاية القائمة M
        M.addlast(20); // إضافة عنصر 20 في نهاية القائمة M

        System.out.print("list2: ");
        M.print(); // طباعة قائمة M باستخدام الأسلوب print()

        System.out.print("after margin list: ");
        L = L.margin(L, M); // استخدام الأسلوب margin() لدمج قائمة M في قائمة L وتخزين النتيجة في L
        L.print(); // طباعة القائمة L بعد الدمج باستخدام الأسلوب print()
    }
}