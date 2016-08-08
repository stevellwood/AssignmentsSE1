package chess;

public class Location {
    
        public int x;
        public int y;
       //public int cx, cy;
    public Location(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Location other = (Location) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }
    public Location offset(int x, int y){
//         this.cx = cx + x;
//         this.cy = cy + y;
//         return this.fx + x, this.y+y)
          return new Location (this.x + x, this.y+y);
    }//this replaces new Location (currsent.x+2, current.y_1
}
