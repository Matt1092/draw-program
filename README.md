# DrawMaster

This Java Paint Program is a simple drawing application built using the Swing framework. It allows users to draw various shapes such as lines, rectangles, round rectangles, and ovals. The application also supports features like undo, redo, and saving the drawn image to a file.

## Features

- **Draw Shapes**: Users can draw lines, rectangles, round rectangles, and ovals.
- **Fill Shapes**: The shapes can be filled or unfilled based on user selection.
- **Change Colors**: Users can choose different colors for the shapes using a color chooser.
- **Undo and Redo**: Users can undo and redo their actions.
- **Save to File**: The drawn image can be saved as a PNG file.

## Installation and Running

1. **Clone the repository**:
    ```bash
    git clone https://github.com/Matt1092/DrawMaster.git
    cd DrawMaster
    ```

2. **Compile the application**:
    ```bash
    javac *.java
    ```

3. **Run the application**:
    ```bash
    java ShapePainter
    ```
    
    **Note:** Make sure your local machine has a graphical environment to display the GUI.

## Required Files

The application requires the following PNG files to be present in the root directory of the repository:
- `colour.png`
- `line.png`
- `roundrect.png`
- `rectangle.png`
- `oval.png`
- `undo.png`
- `redo.png`
- `fill.png`
- `empty.png`
- `savetofile.png`

Make sure these files are uploaded to the repository before running the application.

## Usage

- **Drawing Shapes**:
  - Click the shape buttons (line, rectangle, round rectangle, oval) to select the shape you want to draw.
  - Click and drag the mouse on the drawing panel to draw the selected shape.
  
- **Changing Colors**:
  - Click the color button to open the color chooser dialog and select a color.
  
- **Fill Shapes**:
  - Click the fill button to draw filled shapes.
  - Click the empty button to draw unfilled shapes.
  
- **Undo and Redo**:
  - Click the undo button to undo the last action.
  - Click the redo button to redo the last undone action.
  
- **Save to File**:
  - Click the save button to save the current drawing as a PNG file.

## Classes

- **Shape.java**: Abstract class modeling the basic functionalities of a shape.
- **FillableShape.java**: Abstract subclass of `Shape` that adds fillable functionality.
- **Rectangle.java**: Class for drawing rectangles.
- **RoundRectangle.java**: Class for drawing round rectangles.
- **Oval.java**: Class for drawing ovals.
- **Line.java**: Class for drawing lines.
- **DrawPanel.java**: Swing component that handles drawing and user interactions.
- **ShapePainter.java**: Main class that initializes and runs the application.

## Screenshots

Here are some screenshots of the DrawMaster application in action:

### Main Interface
![Main Interface](https://github.com/Matt1092/DrawMaster/blob/main/screenshots/main_interface.png)

### Drawing Shapes
![Drawing Shapes](https://github.com/Matt1092/DrawMaster/blob/main/screenshots/drawing_shapes.png)

### Color Picker
![Color Picker](https://github.com/Matt1092/DrawMaster/blob/main/screenshots/color_picker.png)

### Saving Drawings
![Saving Drawings](https://github.com/Matt1092/DrawMaster/blob/main/screenshots/saving_drawings.png)


## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgements

- This project was created by Matthew Moga.
- Icons used in the application can be credited to their respective creators.

## Contributing

If you would like to contribute to this project, please fork the repository and submit a pull request.
