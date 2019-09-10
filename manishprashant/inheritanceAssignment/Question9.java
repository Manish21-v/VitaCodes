package inheritanceAssisgnment;

public class Question9 {
	static void perform(Game g)
	{
		g.Play();
	}
	public static void main(String[] args) {
		perform(new Cricket());
		perform(new Football());
		perform(new Tennis());
	}

}

interface Game
{
	abstract public void Play();
}

class Cricket implements Game
{

	@Override
	public void Play() {
		System.out.println("play Cricket");
	}
	
}

class Football implements Game
{

	@Override
	public void Play() {
		System.out.println("play Football");
	}
}

class Tennis implements Game
{

	@Override
	public void Play() {
		System.out.println("Play Tennis");
	}
	
}