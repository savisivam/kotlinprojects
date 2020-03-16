package com.example.navigation;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;

public class FirstFragmentDirections {
  @NonNull
  public static ActionFirstFragmentToSendMoneyGraph actionFirstFragmentToSendMoneyGraph() {
    return new ActionFirstFragmentToSendMoneyGraph();
  }

  public static class ActionFirstFragmentToSendMoneyGraph implements NavDirections {
    public ActionFirstFragmentToSendMoneyGraph() {
    }

    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      return __outBundle;
    }

    public int getActionId() {
      return com.example.navigation.R.id.action_firstFragment_to_sendMoneyGraph;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      if (!super.equals(object)) {
          return false;
      }
      ActionFirstFragmentToSendMoneyGraph that = (ActionFirstFragmentToSendMoneyGraph) object;
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = super.hashCode();
      result = 31 * result + getActionId();
      return result;
    }
  }
}
