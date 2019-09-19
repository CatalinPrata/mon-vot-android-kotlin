package ro.code4.monitorizarevot.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import org.parceler.Parcel

//@Entity(tableName = "answer")
@Parcel(Parcel.Serialization.FIELD)
class Answer {
    //    @PrimaryKey
    @Expose
    @SerializedName("idOptiune")
    val id: Int? = null

    @Expose
    @SerializedName("textOptiune")
    val text: String? = null

    @Expose
    @SerializedName("seIntroduceText")
    private val hasManualInput: Boolean = false

    fun hasManualInput(): Boolean {
        return hasManualInput
    }
}