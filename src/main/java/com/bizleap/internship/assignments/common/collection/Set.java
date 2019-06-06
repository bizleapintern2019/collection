package  com.bizleap.internship.assignments.common.collection;

import java.util.List;
import com.bizleap.internship.assignments.common.collections.impl.EntryImpl;

public interface Set {
	public int getCapacity();
	public void setCapacity(int capacity);
	public boolean add(String key);
	public String get(String key);
	public List<EntryImpl> getAll();
	public boolean contains(String key);

}
