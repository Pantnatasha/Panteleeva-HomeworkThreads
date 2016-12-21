/**
 * Created by Admin on 21.12.2016.
 */
public interface ExecutionManager {
    Context execute(Runnable callback, Runnable... tasks);
}
