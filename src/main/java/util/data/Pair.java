package util.data;

import com.google.common.base.Objects;

public class Pair<T1, T2> {
    public final T1 first;
    public final T2 second;

    public static <T1, T2> Pair<T1, T2> create(final T1 first, final T2 second) {
	return new Pair<T1, T2>(first, second);
    }

    protected Pair(final T1 firstValue, final T2 secondValue) {
	super();
	this.first = firstValue;
	this.second = secondValue;
    }

    @Override
    public boolean equals(final Object obj) {
	if (this == obj) {
	    return true;
	}
	if (obj == null) {
	    return false;
	}
	if (this.getClass() != obj.getClass()) {
	    return false;
	}
	final Pair<T1, T2> other = (Pair<T1, T2>) obj;
	return Objects.equal(this.first, other.first)
		&& Objects.equal(this.second, other.second);
    }

    @Override
    public int hashCode() {
	return Objects.hashCode(this.first, this.second);
    }

    @Override
    public String toString() {
	return "Pair<" + this.first.toString() + "," + this.second.toString()
		+ ">";
    }
}