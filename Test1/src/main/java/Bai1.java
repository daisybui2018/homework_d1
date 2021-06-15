public class Bai1 {
    public static int demTu(String s) {
        int dem = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                dem++;
            }
        }
        return dem;
    }
    public static void convertUpperCase(String s){
        String[] arr = s.split("");
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == ' ') {
                arr[i] = String.valueOf(s.charAt(i)).toUpperCase();
            }
        }
        System.out.println("Viết in hoa toàn bộ chữ đầu tiên của các từ trong chuỗi:");
        for (String a : arr) {
            System.out.print(a);
        }
        System.out.println();
    }
    public static String ChuanHoa(String str)
    {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        str = str.toLowerCase();
        String[] arrayStr = str.split(" ");
        StringBuilder newstring = new StringBuilder();
        String temp = String.valueOf(arrayStr[0].charAt(0));
        newstring.append(temp.toUpperCase()+arrayStr[0].substring(1).toString());
        newstring.append(" ");
        for (int i = 1; i< arrayStr.length;i++ )
        {
            newstring.append(arrayStr[i]);
            if(arrayStr[i].contains("."))
            {
                newstring.append(" ");
                temp = String.valueOf(arrayStr[i+1].charAt(0));
                newstring.append(temp.toUpperCase() + arrayStr[i+1].substring(1).toString());
                i++;
            }
            newstring.append(" ");
        }
        return newstring.toString().trim();
    }
}
