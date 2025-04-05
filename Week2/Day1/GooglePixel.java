package week2.day1;

public class GooglePixel {

	
public void takePhoto(int noOfPhoto) {
		
       System.out.println(noOfPhoto);
	}
	
	
	public void takeVideo(int noOfVideo, String filename) {
		
    System.out.println(noOfVideo+" "+filename);
	}
	
	
	
	public static void main(String[] args) {
		GooglePixel pixelOptions=new GooglePixel();
		pixelOptions.takePhoto(10);
		pixelOptions.takePhoto(5);
		pixelOptions.takeVideo(3, "video1");
	}

}
