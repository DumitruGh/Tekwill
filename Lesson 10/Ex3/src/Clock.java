public class Clock {
    int minutes;
    int hours;
   public void next(){
         if( minutes >=0&&minutes<59){
             this.hours = hours;
             minutes++;
         }else if(minutes==59){
             minutes =0;
             hours++;
         }
         if(hours >12){
             hours = 1;
         }
   }
   public void getHours(){
       System.out.printf("%02d:%02d%n", this.hours , this.minutes);
   }
}
