public class arraysDemo {
    public static void main(String[] args) {
      /*  String ogrenci1 = "Engin";
        String ogrenci2 = "Derin";
        String ogrenci3 = "Salih";

        System.out.println(ogrenci1); */

        String [] ogrenciler = new String[3];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Salih";

        for (int i=0; i<ogrenciler.length;i++) {
            System.out.println(ogrenciler[i]);

        }

        for (String ogrenci: ogrenciler) {                // EN ÇOK TERCİH EDİLEN YÖNTEM BU << FOREACH DÖNGÜSÜĞ
            System.out.println(ogrenci);
        }
    }
}
