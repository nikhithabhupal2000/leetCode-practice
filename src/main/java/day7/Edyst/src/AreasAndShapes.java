import java.util.*;
class AreasAndShapes{
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int tests = ip.nextInt();
        while(tests != 0){
            String c = ip.nextLine();
            String shape = ip.nextLine();
            int dim1 = ip.nextInt();
            int dim2 = ip.nextInt();
            switch(shape){
                case "triangle":System.out.println(dim1 * dim2);
                    break;
                case "rectangle":System.out.println(dim2 * dim2);
                    break;
                case "square" :System.out.println(dim1 * dim2 / 2);
                    break;
                default:System.out.println(0);
    
            }
            tests --;
        }
    }
}



