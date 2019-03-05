package com.example.olympeapp.ui

import android.content.Context
import android.support.v4.content.res.TypedArrayUtils.getResourceId
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.olympeapp.R
import kotlinx.android.synthetic.main.message_card.view.*
import java.text.SimpleDateFormat
import java.util.*

/**
 *
 * @author yanngodeau on 01/03/2019
 */
class MessageCard @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0,
    defStyleRes: Int = 0
) : LinearLayout(context, attrs, defStyle, defStyleRes) {

    init {
        LayoutInflater.from(context).inflate(R.layout.message_card, this, true)
        orientation = VERTICAL

        attrs?.let {
            val typedArray = context.obtainStyledAttributes(it, R.styleable.MessageCard, 0, 0)

            val text: CharSequence = resources.getText(
                typedArray.getResourceId(
                    R.styleable.MessageCard_textAttr,
                    R.string.lorem_ipsum
                )
            )

            // Can get String instead of CharSequence
            message_card_text.text = text
        }

    }
}