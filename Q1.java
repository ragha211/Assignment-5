public class Q1 {
   public static void main(String[] args) {
      doulayLinkedList<Integer> list = new doulayLinkedList<>(); // إنشاء قائمة مزدوجة الاتجاه جديدة من نوع Integer

      list.addFirst(11); // إضافة عنصر 11 في بداية القائمة
      list.addlast(12); // إضافة عنصر 12 في نهاية القائمة
      list.addlast(13); // إضافة عنصر 13 في نهاية القائمة
      list.addlast(14); // إضافة عنصر 14 في نهاية القائمة
      list.addlast(15); // إضافة عنصر 15 في نهاية القائمة

      System.out.println("Size of list: " + list.size()); // طباعة حجم القائمة

      // إيجاد العنصر الوسطى في القائمة وطباعة قيمته
      System.out.println("element of middle node: " + list.findMiddle(list).element);
   }
}