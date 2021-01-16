public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;
    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super();
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MovablePoint(){}
    public float getxSpeed(){
        return xSpeed;
    }
    public float getySpeed(){
        return ySpeed;
    }

    public void setxSpeed(float xSpeed){
        this.xSpeed=xSpeed;
    }
    public void setySpeed(float ySpeed){
        this.ySpeed=ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        return new float[]{xSpeed, ySpeed};
    }
    public String toString(){
        return super.toString()+",speed=("+xSpeed+","+ySpeed+")";
    }
    public MovablePoint move(){
        xSpeed+=getX();
        ySpeed+=getY();
        return this;
    }
}
