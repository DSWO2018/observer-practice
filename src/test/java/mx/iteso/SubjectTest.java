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
public class SubjectTest {
    Subject mockedSubject;
    Observer mockedObserver;

    @Before
    public void setUp() throws Exception {
        mockedSubject = mock(Subject.class);
        mockedObserver= mock(Observer.class);
    }

    @Test
    public void testRegisterObserver(){
        when(mockedSubject.registerObserver(mockedObserver)).thenReturn(true);
    }

    @Test
    public void testRemoveObserver() throws Exception {
        when(mockedSubject.removeObserver(mockedObserver)).thenReturn(true);
    }

    @Test
    public void testNotifyObservers() throws Exception {
        when(mockedSubject.notifyObservers("", mockedObserver)).thenReturn(true);
    }
}