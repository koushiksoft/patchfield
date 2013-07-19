package com.noisepages.nettoyeur.patchbay.control;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

public class PatchOverlay extends View {

  private PatchView pv = null;

  public PatchOverlay(Context context) {
    super(context);
  }

  public PatchOverlay(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public PatchOverlay(Context context, AttributeSet attrs, int defStyle) {
    super(context, attrs, defStyle);
  }
  
  void setPatchView(PatchView pv) {
    this.pv = pv;
  }

  @Override
  protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);
    if (pv != null) {
      pv.drawOverlay(canvas);
    }
  }
}