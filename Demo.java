public class Demo{
    public static String arrToString(int[] arr){
	if(arr.length==0) return "{}";
	String out = "{";
	for(int i = 0; i<arr.length-1; i++){
	    out+=Integer.toString(arr[i])+", ";
	}
	out+=Integer.toString(arr[arr.length-1])+"}";
	return out;
    }
    
    public static String arrayDeepToString(int[][] arr){
	if(arr.length==0) return "{}";
	String out = "{";
	for(int i = 0; i<arr.length-1; i++){
	    out+=arrToString(arr[i])+", ";
	}
	out+=arrToString(arr[arr.length-1])+"}";
	return out;
    }
        
    public static void printLoop(int n){
	for(int i = 1; i<=n; i++){
	    for(int j = 0; j<=n-i; j++){
		System.out.print(i);
	    }
	    System.out.println();
	}
    }

    public static int rand(int v){
	return (int) Math.round(Math.random()*v);
    }
    
    public static int[][] create2DArray(int rows, int cols, int maxValue){
	int[][] out = new int[rows][cols];
	for(int i = 0; i<rows; i++){
	    for(int j = 0; j<cols; j++){
		out[i][j] = rand(maxValue);
	    }
	}
	return out;
    }

    public static int[][] create2DArrayRandomized(int rows, int maxCols, int maxValue){
	return create2DArray(rows, rand(maxCols), maxValue);
    }    
    
    public static void main(String []args){
	if(args.length>0) printLoop(Integer.parseInt(args[0]));
	else printLoop(5);
	int[][] a = {{},{1,2},{1,2,3}};
	/*System.out.println(arrayDeepToString(a).replace("}, ","},\n "));
	System.out.println(arrayDeepToString(create2DArray(5,4,4)));
	System.out.println(arrayDeepToString(create2DArrayRandomized(5,4,4)));
	System.out.println(arrayDeepToString(create2DArrayRandomized(5,4,4)));*/
    }
}
