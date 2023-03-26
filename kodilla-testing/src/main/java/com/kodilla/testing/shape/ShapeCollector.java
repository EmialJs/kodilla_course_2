package com.kodilla.testing.forum;

    class ShapeCollector {
        private ArrayList<Shape> shapes = new ArrayList<Shape>();

        public void addFigure(Shape shape) {
            shapes.add(shape);
        }

        public void removeFigure(Shape shape) {
            shapes.remove(shape);
        }

        public Shape getFigure(int n) {
            return shapes.get(n);
        }

        public String showFigures() {
            StringBuilder sb = new StringBuilder();
            for (Shape shape : shapes) {
                sb.append(shape.getShapeName() + " ");
            }
            return sb.toString();
        }
    }
