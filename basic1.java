
class Main {
    public static void main(String[] args) {
        int[] a = {10,20,30,40};
        int[] b = {10,20,30,40};

        boolean rota = false;
        int i;
       if(a.length==b.length){
        for (i=0;i<a.length;i++) {
            int count = 0;
            
            for (int j=0;j<a.length;j++) {
                if (a[(i+j)%a.length] == b[j])
                   count++;
            }
            if (count == a.length) {
                rota = true;
                break;
            }
        }
     } 
        if (rota==true){
            System.out.println("B is rotation of A");
        }
        else{
            System.out.println("B is NOT rotation of A");
        }
    }
}