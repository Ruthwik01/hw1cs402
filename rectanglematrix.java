
import com.NaiveMul.*;

public class rectanglematrix {

    public static void main(String[] args) {
        
        String osn = System.getProperty("os.name");
        String javavr = System.getProperty("java.version");
        String osAr = System.getProperty("os.arch");
        String osv = System.getProperty("os.version");
        String cpuAr = System.getProperty("os.arch");
        int avprocessors = Runtime.getRuntime().availableProcessors();
        long maxmem = Runtime.getRuntime().maxMemory() / (1024 * 1024);
        System.out.println("OS: " + osn + " " + osv + " (" + osAr + ")");
        System.out.println("Version of Java: " + javavr + "│ CPU Architecture: " + cpuAr + "│ Available Processors (Cores): " + avprocessors + "│ Max Memory (MB): " + maxmem);
        System.out.println();




        int rws;
        int cls;
         int i;
        System.out.println("row Column timeint_naive timedouble_naive time_int time_double");
         for(i=50;i<=1000;i+=50)
         {
            rws=i;
            cls=i+20;
         
        
          int[][] Aint = NaiveMult.randomintmatrix(rws, cls);
          int[][] Bint = NaiveMult.randomintmatrix(cls, rws);
          double[][] Adouble = NaiveMult.randomdblmatrix(rws, cls);
          double[][] Bdouble = NaiveMult.randomdblmatrix(cls, rws);
  
        
          long start, end;
          
          // Multiply integer
          start = System.nanoTime();
          int[][] intres = NaiveMult.multintmatrix(Aint,Bint);
          end = System.nanoTime();
          double inttime1 = (end - start);

        start = System.nanoTime();
          intres = NaiveMult.nmultintmatrix(Aint, Bint);
          end = System.nanoTime();
          double inttime2 = (end - start);
          // Multiply double
          start = System.nanoTime();
          double[][] doubleres = NaiveMult.multdblmatrix(Adouble, Bdouble);
          end = System.nanoTime();
          double dbltime1 = (end - start);

        start = System.nanoTime();
        doubleres = NaiveMult.nmultdblmatrix(Adouble, Bdouble);
          end = System.nanoTime();
          double dbltime2 = (end - start);
        
        System.out.println(rws+" "+cls+" "+inttime1+" "+dbltime1+" "+inttime2+" "+dbltime2+" ");
         }
        
      }

    }



