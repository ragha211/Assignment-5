// إنشاء قائمة مزدوجة الاتجاه وإضافة العناصر إليها،
// ثم استنساخ القائمة الأولى للحصول على قائمة ثانية تحتوي على نفس العناصر، وأخيرًا طباعة محتوى القوائم الأصلية والمستنسخة.
public class Q7 {
  public static void main(String[] args) {
    doulayLinkedList<Integer> list = new doulayLinkedList<>(); // إنشاء قائمة مزدوجة list
    doulayLinkedList<Integer> list1 = new doulayLinkedList<>(); // إنشاء قائمة مزدوجة list1

    list.addFirst(11); // إضافة عنصر 11 في بداية القائمة list باستخدام الأسلوب addFirst()
    list.addlast(12); // إضافة عنصر 12 في نهاية القائمة list باستخدام الأسلوب addlast()
    list.addlast(13); // إضافة عنصر 13 في نهاية القائمة list باستخدام الأسلوب addlast()
    list.addlast(14); // إضافة عنصر 14 في نهاية القائمة list باستخدام الأسلوب addlast()
    list.addlast(15); // إضافة عنصر 15 في نهاية القائمة list باستخدام الأسلوب addlast()
    list.addlast(16); // إضافة عنصر 16 في نهاية القائمة list باستخدام الأسلوب addlast()

    System.out.print("list1: ");
    list.print(); // طباعة المحتوى الحالي للقائمة list باستخدام الأسلوب print()

    list1 = list1.clone(list); // استنساخ (نسخ) القائمة list للحصول على قائمة list1 بواسطة الأسلوب clone()
    System.out.println("after clone: ");
    System.out.print("list1: ");
    list.print(); // طباعة المحتوى الحالي للقائمة list بعد الاستنساخ باستخدام الأسلوب print()

    System.out.print("list2: ");
    list1.print(); // طباعة المحتوى الحالي للقائمة list1 باستخدام الأسلوب print()
  }
}