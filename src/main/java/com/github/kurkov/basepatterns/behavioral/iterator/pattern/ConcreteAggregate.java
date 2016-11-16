package com.github.kurkov.basepatterns.behavioral.iterator.pattern;

/**
 * @author Aleksey Kurkov. Created on 16.11.2016
 */
public class ConcreteAggregate implements Aggregate {
    private Context[] array;

    public ConcreteAggregate(Context[] array) {
        this.array = array;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator();
    }

    private class ConcreteIterator implements Iterator {
        private int index;

        @Override
        public boolean hasNext() {
            return index < array.length;
        }

        @Override
        public Context next() {
            return array[index++];
        }
    }
}
