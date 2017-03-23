
package latihanbab2dan3;
public class konversi {
public String[] kata ={"nol", "satu" , "dua" , "tiga" , "empat" , "lima" , "enam" , "tujuh" , "delapan" , "sembilan" , "sepuluh" , "sebelas"}; 

    
public String Konversi (int angka){
    if (angka == 1000) {
        return "Seribu";
    }else if (angka <= 999 && angka >= 200) {
            return Konversi(angka / 100) + " ratus " + Konversi(angka % 100);
        } else if (angka <= 199 && angka >= 100) {
            return "seratus " + Konversi(angka % 100);
        } else if (angka <= 99 && angka >= 20) {
            return Konversi(angka / 10) + " puluh " + Konversi(angka % 10);
        } else if (angka >= 12 && angka < 20) {
            return kata[angka % 10] + " belas";
        } else if (angka < 12) {
            if (angka == 11) {
                return kata[angka];
            } else if (angka == 10) {
                return kata[angka];
            } else if (angka == 9) {
                return kata[angka];
            } else if (angka == 8) {
                return kata[angka];
            } else if (angka == 7) {
                return kata[angka];
            } else if (angka == 6) {
                return kata[angka];
            } else if (angka == 5) {
                return kata[angka];
            } else if (angka == 4) {
                return kata[angka];
            } else if (angka == 3) {
                return kata[angka];
            } else if (angka == 2) {
                return kata[angka];
            } else if (angka == 1) {
                return kata[angka];
            }
        }
        return " ";
    }  
 
public String konversi (String kata){
    for (int i = 0; i <= 1000 ; i++) {
   String kataTemp = kata.replaceAll("\\s"," ");
            String KonversiTemp = Konversi(i).replaceAll("\\s ", "");
            if (kataTemp.equalsIgnoreCase(KonversiTemp)) {
                return Integer.toString(i);
            } 
            else if (kataTemp.equalsIgnoreCase("nol")) {
                return Integer.toString(0);
            }
        }
        return " ";
    }


}
   










