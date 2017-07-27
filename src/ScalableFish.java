
public class ScalableFish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		drawFish(1);
	}
	
	public static void drawFish(int size) {
		// The size passed in tells us how big the fish is
		// Size one means one line in the tail fin, two is two lines, etc.
		//   The tail fin also has a single character to attach it to the body
		// The body is twice as long as the tail
		//   So a size one fish has two lines in the tail, four in the body
		//   A size two fish has three lines in the tail, six in the body
		// The mouth is the same size as the tail
		
		int tailSize = size+1;
		int bodySize = tailsize*2;
		int mouthSize = tailSize;
		
		// Spacing is another matter - every line has an odd number of things in it
		// The body max width is the number of lines doubled plus 1
		// The tail and mouth max widths are the passed in size doubled plus 1
		// The tail is spaced to be centered over the body, so the spacing starts at:
		//    (bodyWidth - tailWidth) / 2
		//  and increase by one each line
		// The mouth spacing starts at one, and increases by one each line
		// The mouth interior spacing starts at one, and increases by two each line
		
		int bodyMaxWidth = (bodySize*2)+1;
		int tailMaxWidth = (size *2)+1;
		int mouthMaxWidth = tailMaxWidth;
		
		int tailInitialSpacing = (bodyMaxWidth - tailMaxWidth)/2;
		int mouthInitialSpacing = 1;
		int mouthInternalSpacing = 1;
		
		
		
	}

}
