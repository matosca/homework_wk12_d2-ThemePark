package Visitors;

import Visitors.Visitor;

public interface ITicketed {

    double defaultPrice();

    double priceFor(Visitor visitor);
}
