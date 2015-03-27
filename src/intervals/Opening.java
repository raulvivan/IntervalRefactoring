package intervals;

public enum Opening {
	
	LEFT_OPENED{
		@Override
		public OpeningType getType() {
			return new OpeningLeft();
		}
	}, 
	RIGHT_OPENED {
		@Override
		public OpeningType getType() {
			return new OpeningRight();
		}
	}, 
	BOTH_OPENED {
		@Override
		public OpeningType getType() {
			return new OpeningOpened();
		}
	}, 
	UNOPENED {
		@Override
		public OpeningType getType() {
			return new OpeningUnopened();
		}
	};

	public abstract OpeningType getType();
}
