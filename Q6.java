public class Q6 {
  public static void main(String[] args) {
    doulayLinkedList<Integer> list = new doulayLinkedList<>(); // إنشاء قائمة مزدوجة list
    circularlyLinkedList<Integer> list1 = new circularlyLinkedList<>(); // إنشاء قائمة دائرية list1

    list.addFirst(11); // إضافة عنصر 11 في بداية القائمة list باستخدام الأسلوب addFirst()
    list.addlast(12); // إضافة عنصر 12 في نهاية القائمة list باستخدام الأسلوب addlast()
    list.addlast(13); // إضافة عنصر 13 في نهاية القائمة list باستخدام الأسلوب addlast()
    list.addlast(14); // إضافة عنصر 14 في نهاية القائمة list باستخدام الأسلوب addlast()
    list.addlast(15); // إضافة عنصر 15 في نهاية القائمة list باستخدام الأسلوب addlast()
    list.addlast(16); // إضافة عنصر 16 في نهاية القائمة list باستخدام الأسلوب addlast()

    System.out.print("list1: ");
    list.print(); // طباعة المحتوى الحالي للقائمة list باستخدام الأسلوب print()

    list1 = list.version(list); // تحويل القائمة list إلى قائمة دائرية وتخزين النتيجة في list1 باستخدام الأسلوب version()
    System.out.println("after version: ");
    System.out.print("list1: ");
    list.print(); // طباعة المحتوى الحالي للقائمة list بعد التحويل باستخدام الأسلوب print()

    System.out.print("list2: ");
    list1.print(); // طباعة المحتوى الحالي للقائمة list1 باستخدام الأسلوب print()
  }
}