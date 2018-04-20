package cn.design.pattern.demo.observe.pattern;

/**
 * 
 * @author Administrator
 *	被观察者接口
 */
public interface Observerable {
	public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
