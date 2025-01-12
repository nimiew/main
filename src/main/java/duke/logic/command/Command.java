package duke.logic.command;

import java.io.IOException;
import java.text.ParseException;

import duke.exception.DukeException;
import duke.storage.Storage;
import duke.storage.UndoStack;
import duke.tasklist.TaskList;
import duke.ui.Ui;

/**
 * Abstract class duke.logic.parser.command.Command which dictates
 * three necessary methods in all duke.logic.parser.command.Command subclasses
 * method execute which will execute whatever the user input requests
 * method savePrevState which will store mirror commands for commands that can be undone
 * method isExit which checks whether the user input
 * will result in the program shutting down
 */
public abstract class Command {
    public abstract void execute(TaskList tasks, Ui ui, Storage storage) throws IOException, ParseException,
            DukeException;

    public abstract void savePrevState(TaskList tasks, UndoStack undoStack) throws DukeException;

    public boolean isExit() {
        return false;
    }
}
