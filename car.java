class Circle{
    final float pi=3.14f;
    float area(float rad){
     float ar= pi *rad * rad;
        return(ar);
    }
}
class car{
    public static void main(String args[]) {
        Circle obj=new Circle();
        float r= float.ValueOf(args[0]);
        float ar=obj.area(r);
        System.out.println(ar);
        
    }
}