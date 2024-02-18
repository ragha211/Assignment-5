public class Q5 {
    public static void main(String[] args) {
        doulayLinkedList2<Integer> list = new doulayLinkedList2<>(); // إنشاء قائمة مزدوجة الاتجاه list

        System.out.println(list.size()); // طباعة حجم القائمة باستخدام الأسلوب size()
        System.out.println(list.isEmpty()); // طباعة إذا كانت القائمة فارغة أم لا باستخدام الأسلوب isEmpty()

        list.addFirst(11); // إضافة عنصر 11 في بداية القائمة باستخدام الأسلوب addFirst()
        list.addlast(12); // إضافة عنصر 12 في نهاية القائمة باستخدام الأسلوب addlast()
        list.addlast(13); // إضافة عنصر 13 في نهاية القائمة باستخدام الأسلوب addlast()
        list.addlast(14); // إضافة عنصر 14 في نهاية القائمة باستخدام الأسلوب addlast()

        list.print(); // طباعة المحتوى الحالي للقائمة باستخدام الأسلوب print()

        System.out.println(list.size()); // طباعة حجم القائمة بعد إضافة العناصر

        while (!list.isEmpty()) { // حلقة تستمر حتى تكون القائمة فارغة
            System.out.println(list.removeFrist() + " "); // إزالة العنصر الأول من القائمة وطباعته باستخدام الأسلوب removeFirst()
            System.out.println(list.size()); // طباعة حجم القائمة بعد إزالة العنصر
        }

        list.print(); // طباعة المحتوى النهائي للقائمة بعد إزالة العناصر
    }
}