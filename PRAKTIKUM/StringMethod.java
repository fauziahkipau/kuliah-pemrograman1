public class StringMethod{
    public static void main(String args[]){
    int indeks;
    String st = new String("ini untuk mencoba Metode string!"); /* menghitung jumlah karakter dari st */
    int pj = st.length();
    System.out.println("1. Hitung jumlah karakter menggunakan perintah .length dari variable pj, dengan hasil hasilnya " + pj + " karakter");
    /* membaca karakter ke-5 dari st */
    char c = st.charAt(5);
    System.out.println("2. menampilkan karakter ke 5 yang ada i variable c, hasilnya: " + c);
    /* apakah st dimulai dengan "ini" */
    boolean b1 = st.startsWith("ini");
    System.out.println("3. Cek apakah kalimat dimulai dari kata ini, hasilnya: " + b1);
    /* apakah st dimulai dengan "st" mulai karakter ke-4 */ 
    boolean b2 = st.startsWith("st",4);
    System.out.println("4. Cek apakah karakter ke-4 dimulai dengan kata st, hasilnya: " + b2 + " karna harusnya u");
    /* apakah st diakhiri dengan "string." */
    boolean b3 = st.endsWith("string!");
    System.out.println("5. cek apakah st diakhiri dengan string. ? hasilnya: "+ b3 + " karna harusnya string!");
    /* apakah st diakhiri dengan "g!" */
    boolean b4 = st.endsWith("g!");
    System.out.println("5. cek apakah st diakhiri dengan string. ? hasilnya: "+ b3 + " karna harusnya string!");

    // System.out.println(st); System.out.println(pj); System.out.println(c); System.out.println(b1); System.out.println(b2); System.out.println(b3); System.out.println(b4);

    /* pencarian karakter dari depan */ 
    // System.out.print(">>> Karakter 'n' berada pada indeks"); 
    indeks = st.indexOf('n');
    System.out.println("6. menemukan posisi index pada huruf n menggunakan indexOf, berada di urutan ke " + indeks);
    while (indeks>=0){
        System.out.println(">" + indeks);
        indeks = st.indexOf('n', indeks + 1); 
    }
    System.out.println("7. hasil mapping: " + indeks);

    /* pencarian teks dari depan */ 
    // System.out.print("Teks \"in\" berada pada indeks : "); 
    indeks = st.indexOf("in");
    System.out.println("8. menemukan posisi index pada kata in menggunakan indexOf, berada di urutan ke  " + indeks); 
    while (indeks>=0){
        System.out.println("> " + indeks);
        indeks = st.indexOf("in",indeks+1); 
    }
    System.out.println("9. hasil mapping: " + indeks);


    /* pencarian karakter dari belakang */ 
    indeks = st.lastIndexOf('n');
    System.out.println("10. menemukan posisi index yang paling belakang pada huruf n menggunakan lastIndexOf, berada di urutan ke  " + indeks); 
    while (indeks>=0){
        System.out.println("> " + indeks);
        indeks = st.lastIndexOf('n',indeks-1); 
    }
    System.out.println("11. hasil mapping: " + indeks);

    /* pencarian teks dari belakang */ 
    indeks = st.lastIndexOf("in");
    System.out.println("12. menemukan posisi index yang paling belakang pada kata in menggunakan lastIndexOf , berada di urutan ke  " + indeks); 
    while (indeks>=0){
        System.out.println("> " + indeks);
        indeks = st.lastIndexOf("in",indeks-1); 
    }

    System.out.println("11. hasil mapping: " + indeks);

    /* menampilkan substring dari st mulai karakter ke-6 sampai terakhir */

    String sub_string = st.substring(6);
    System.out.println("12. menampilkan substring dari variabel sj dimula dari karakter urutan ke ke-6 sampai akhir. hasilnya: " + sub_string);

    /* menampilkan substring dari st mulai karakter ke-6 sampai ke-17 */ 
    System.out.println(st.substring(6,17));
    String st2 = new String("13. menampilkan karakter mulai dari 6 sampai 17");

    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println("");
    System.out.println("");
    System.out.println("");



    System.out.println("st == st2 : " + st==st2); System.out.println("st.equals(st2) : " + st.equals(st2)); System.out.println("st.equalsIgnoreCase(st2.toUpperCase()) : " +
    st.equalsIgnoreCase(st2.toUpperCase()));
    System.out.println("st.compareTo(st2) : " + st.compareTo(st2));
    System.out.println("st.compareTo(st2.toLowerCase()) : " + st.compareTo(st2.toLowerCase()));
    System.out.println("st.compareTo(st2.toUpperCase()) : " + st.compareTo(st2.toUpperCase()));
} 
}