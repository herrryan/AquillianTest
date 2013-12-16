package arquillian.seam.test.event;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.core.Events;

@Name("emitter")
public class MultiplierEmitter {
	
	public void multiple(Double num){
		Events.instance().raiseEvent(Event.MULTIPLY_BY_TEN, num);
	}
}
