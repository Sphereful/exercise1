package freeflow.exercise2;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import java.util.UUID;

public class WorkoutActivity extends SingleFragmentActivity {

    private static final String EXTRA_WORKOUT_ID =
            "com.freeflow.android.exercise.workout_id";

    public static Intent newIntent(Context contextPackage, UUID workoutID){
        Intent intent = new Intent(contextPackage, WorkoutActivity.class);
        intent.putExtra(EXTRA_WORKOUT_ID, workoutID);
        return intent;
    }

    @Override
    protected Fragment createFragment() {
        UUID workoutId = (UUID) getIntent().getSerializableExtra(EXTRA_WORKOUT_ID);
        return EditingFragment.newInstance(workoutId);
    }
}
