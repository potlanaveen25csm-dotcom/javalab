class a {
    void divide() throws ArithmeticException{
        int a=10,b=2;
        int k=a/b;
    }
    public class Throws {
    
        public static void main(String[] args) {
            a obj=new a();
            try{
                obj.divide();
            }
            catch(ArithmeticException e){
                System.out.println("b is not equal to zero");
            }
            finally{
                System.out.println("program is executed");
            }

            }
        }
    }
