package mx.iteso;

import mx.iteso.observer.Observer;
import mx.iteso.subject.Subject;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Palaf on 22/09/2018.
 */
public class ObserverTest {
    Subject mockedSubject;
    Observer mockedObserver;

    @Before
    public void setUp(){
        mockedSubject = mock(Subject.class);
        mockedObserver= mock(Observer.class);
    }

    @Test
    public void testScoreUpdate()  {
        when(mockedObserver.scoreUpdate(mock(String.class),mock(String.class))).thenReturn(true);
    }
}