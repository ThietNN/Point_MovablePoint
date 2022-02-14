public class MovablePoint extends Point {
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;

    public MovablePoint(){
    }
    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }
    public float getYSpeed() {
        return ySpeed;
    }
    public float[] getSpeed(){
        return new float[] {xSpeed,ySpeed};
    }

    public void setXSpeed(float xSpeed){
        this.xSpeed = xSpeed;
    }
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint move(){
        float x = getX();
        float y = getY();
        x += xSpeed;
        y += ySpeed;
        setX(x);
        setY(y);
        return this;
    }
    @Override
    public String toString(){
        return "MovablePoint. x = "
                + getX()
                + ", y = "
                + getY()
                + ", xSpeed = "
                + xSpeed
                + ", ySpeed = "
                +ySpeed;
    }
}
