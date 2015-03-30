package intervals;

import intervals.openings.OpeningLeft;
import intervals.openings.OpeningOpened;
import intervals.openings.OpeningRight;
import intervals.openings.OpeningType;
import intervals.openings.OpeningUnopened;

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
