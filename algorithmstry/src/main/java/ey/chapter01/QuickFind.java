package ey.chapter01;

/**
 * @Classname QuickFind
 * @Description TODO
 * @Date 2023/4/17 19:16
 * @Author zhoujie-076
 */
public class QuickFind {
    private static int id[];
    private static int length;

 //  private int count=0;
    public QuickFind(int n) {
        length = n;
        id = new int[n+1];
        for(int i=0; i<=n;i++){
            id[i] =i;
        }
    }

    public int find(int p){
        while(p != id[p]){
            p = id[p];
        }
        return p;
    }

    public void union(int p,int q){
        int pRoot = find(p);
        int qRoot = find(q);
        if(pRoot == qRoot){
            return;
        }
        id[p] = qRoot;
      //  count --;
    }

    public  boolean isUnion(int p, int q){
        return find(p) == find(q);
    }



    public static void main(String[] args){
        QuickFind qf = new QuickFind(9);
        qf.union(9,0 );
        qf.union(3,4);
        qf.union(5,8);
        qf.union(7,2);
        qf.union(2,1);
        qf.union(5,7);
        qf.union(0,3);
        qf.union(4,2);
//       for(int i=0;i<=length; i++){
//          System.out.println("id["+i+"]: "+id[i]);
//       }

       System.out.println(qf.isUnion(2,8));


    }

}
