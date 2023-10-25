package ru.yandex.practicum.contacts.presentation.base;
//пустая строка
public interface ListDiffInterface<T> {
    boolean theSameAs(T object);
    boolean equals(Object object);
}
