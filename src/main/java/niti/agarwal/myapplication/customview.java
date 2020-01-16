package niti.agarwal.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;

import androidx.annotation.Nullable;

public class customview  extends View {
    int height;
    int width;
    public customview(Context context) {
        super(context);
    }

    public customview(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public void init(){
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager manager = (WindowManager) getContext().getSystemService(Context.WINDOW_SERVICE);
        manager.getDefaultDisplay().getMetrics(displayMetrics);
         height = displayMetrics.heightPixels;
        width = displayMetrics.widthPixels;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //setBackgroundColor(R.color.colorAccent);
        Paint temp = new Paint();

        temp.setColor(getResources().getColor(R.color.colorPrimary));

        canvas.drawCircle(100,height/2,100,temp);
    }
}
